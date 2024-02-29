package hu.ibello.api.steps;

import hu.ibello.api.model.BlogItem;
import hu.ibello.api.model.BlogItems;
import hu.ibello.apitest.HttpMethod;

import java.io.IOException;
import java.util.ArrayList;

public class GetBlogItemSteps extends AbstractApiSteps<Object, BlogItems> {

    public void call_endpoint_without_parameter() throws IOException {
        sendAndReceive(null);
    }

    public void checking__the_response_is_not_empty() {
        assertions().assertIsNotNull(getOutput());
        assertions().assertIsNotNull(getOutput().getBlogItems());
        assertions().assertIsNotEmpty(getOutput().getBlogItems());
        for (BlogItem blogItem : getOutput().getBlogItems()) {
            assertions().assertIsNotNull(blogItem.getId());
            assertions().assertIsNotNull(blogItem.getAuthor());
            assertions().assertIsNotNull(blogItem.getAuthor().getHu());
            assertions().assertIsNotNull(blogItem.getTitle());
            assertions().assertIsNotNull(blogItem.getTitle().getHu());
            assertions().assertIsNotNull(blogItem.getDescription());
            assertions().assertIsNotNull(blogItem.getDescription().getHu());
            assertions().assertIsNotNull(blogItem.getKeywords());
            assertions().assertIsNotNull(blogItem.getActive());
        }
    }

    protected Class<BlogItems> getOutputType() {
        return BlogItems.class;
    }

    @Override
    protected String getUrlSuffix(Object obj) {
        return "blog/items";
    }

    @Override
    protected HttpMethod getMethod() {
        return HttpMethod.GET;
    }

    @Override
    protected Object getRequestBody(Object obj) {
        return null;
    }
}
