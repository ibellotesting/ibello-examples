package hu.ibello.api.model;

import hu.ibello.data.Model;

@Model
public class Title {
    private String hu;
    private String en;

    public String getHu() {
        return hu;
    }

    public void setHu(String hu) {
        this.hu = hu;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }
}
