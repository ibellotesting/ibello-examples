package hu.ibello.api.steps;

import hu.ibello.api.model.BlogItem;
import hu.ibello.api.model.BlogItems;
import hu.ibello.apitest.HttpMethod;

import java.io.IOException;

public class GetBlogItemSteps extends AbstractApiSteps<Object, BlogItems> {

    public void call_endpoint_without_parameter() throws IOException {
        sendAndReceive(null);
    }

    public void checking__the_response_is_not_empty() {
        assertions().assertThat(getOutput()).isNotNull();
        assertions().assertThat(getOutput().getBlogItems()).isNotNull();
        assertions().assertThat(getOutput().getBlogItems()).isNotEmpty();
        for (BlogItem blogItem : getOutput().getBlogItems()) {
            assertions().assertThat(blogItem.getId()).isNotNull();
            assertions().assertThat(blogItem.getAuthor()).isNotNull();
            assertions().assertThat(blogItem.getAuthor().getHu()).isNotNull();
            assertions().assertThat(blogItem.getTitle()).isNotNull();
            assertions().assertThat(blogItem.getTitle().getHu()).isNotNull();
            assertions().assertThat(blogItem.getDescription()).isNotNull();
            assertions().assertThat(blogItem.getDescription().getHu()).isNotNull();
            assertions().assertThat(blogItem.getKeywords()).isNotNull();
            assertions().assertThat(blogItem.getActive()).isNotNull();
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
