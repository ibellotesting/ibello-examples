package hu.ibello.api.workflow;

import hu.ibello.api.steps.GetBlogItemSteps;
import hu.ibello.core.Name;
import hu.ibello.steps.StepLibrary;

import java.io.IOException;

@Name("Api")
public class ApiWorkflow extends StepLibrary {
	private GetBlogItemSteps getBlog;

	public void I_query_the_blog_articles() throws IOException {
		getBlog.call_endpoint_without_parameter();
	}

	public void The_queried_articles_are_displayed_correctly() {
		getBlog.checking__the_response_is_not_empty();
	}

}