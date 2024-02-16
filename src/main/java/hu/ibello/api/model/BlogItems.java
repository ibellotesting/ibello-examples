package hu.ibello.api.model;

import hu.ibello.data.Model;

import java.util.List;

@Model
public class BlogItems {
    private List<BlogItem> blogItems;

    public List<BlogItem> getBlogItems() {
        return blogItems;
    }

    public void setBlogItems(List<BlogItem> blogItems) {
        this.blogItems = blogItems;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (BlogItem item : blogItems) {
            builder.append(item.toString()).append("\n");
        }
        return builder.toString();
    }
}
