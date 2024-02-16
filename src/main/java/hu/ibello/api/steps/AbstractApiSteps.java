package hu.ibello.api.steps;

import hu.ibello.api.model.ApiResponse;
import hu.ibello.apitest.HttpMethod;
import hu.ibello.apitest.HttpResponse;
import hu.ibello.apitest.RestClient;
import hu.ibello.core.TestException;
import hu.ibello.transform.TransformerException;

import java.io.IOException;

public abstract class AbstractApiSteps<INPUT, OUTPUT> extends AbstractSteps{

    private INPUT input;
    private ApiResponse error;
    private HttpResponse<OUTPUT> httpResponse;

    protected OUTPUT getOutput() {
        return httpResponse.getObject();
    }

    protected abstract Class<OUTPUT>getOutputType();

    protected void sendAndReceive(INPUT input) throws IOException, TransformerException {
        clear();
        this.input = input;
        httpResponse = getRestClient().sendAndReceive(getOutputType());
    }

    protected void clear() {
        error = null;
    }

    protected String getMimeType() {
        return "application/json";
    }

    protected String getAccept() {
        return "application/json";
    }

    protected abstract String getUrlSuffix(INPUT input);

    protected abstract HttpMethod getMethod();

    protected abstract Object getRequestBody(INPUT input);

    private String getUrl(INPUT input) {
        String url = getBaseUrl();
        if (!url.endsWith("/")) {
            url += "/";
        }
        String suffix = getUrlSuffix(input);
        if (suffix.startsWith("/")) {
            suffix = suffix.substring(1);
        }
        return url + suffix;
    }

    private String getBaseUrl() {
        String key = getClass().getPackage().getName() + ".url";
        String baseUrl = getConfigurationValue(key).toString();
        if (baseUrl == null) {
            throw new TestException(String.format("Configuration parameter \"%s\" is missing!", key));
        }
        return baseUrl;
    }

    private RestClient getRestClient() {
        RestClient client = restClient().withoutCertificateValidation()
                .method(getMethod())
                .accept(getAccept())
                .mimeType(getMimeType());
        Object body = getRequestBody(input);
        client.body(body);
        String url = getUrl(input);
        client.url(url);
        return client;
    }
}
