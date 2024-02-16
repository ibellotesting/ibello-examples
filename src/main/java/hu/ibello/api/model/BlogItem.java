package hu.ibello.api.model;

import hu.ibello.data.Model;

import java.util.List;

@Model
public class BlogItem {
    private String id;
    private List<String> ids;
    private Author author;
    private Title title;
    private Description description;
    private Keywords keywords;
    private List<String> links;
    private String date;
    private Boolean active;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Keywords getKeywords() {
        return keywords;
    }

    public void setKeywords(Keywords keywords) {
        this.keywords = keywords;
    }

    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "{" +
                "\nid='" + id + '\'' +
                "\nauthor=" + author.getHu() +
                "\ntitle=" + title.getHu() +
                "\ndescription=" + description.getHu() +
                "\nkeywords=" + keywords.getHu() +
                "\nactive=" + active +
                "\n}";
    }
}
