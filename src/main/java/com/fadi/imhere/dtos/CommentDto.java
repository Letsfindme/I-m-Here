package com.fadi.imhere.dtos;
import com.fadi.imhere.Utils.ObjectUtils;
import java.util.Date;
import java.util.UUID;

public class CommentDto {
    private static final int HASH_CODE_CONSTANT_1 = 31;
    private static final int HASH_CODE_CONSTANT_2 = 0;

    private Long id;
    private Long articleID;
    private String content;
    private Date lastModified;
    private UserDto user;
    private boolean checked;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArticleId() {
        return articleID;
    }

    public void setArticleId(Long articleID) {
        this.articleID = articleID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getLastModified() {
        return ObjectUtils.cloneDate(lastModified);
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = ObjectUtils.cloneDate(lastModified);
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CommentDto that = (CommentDto) o;

        if (id != null ? !id.equals(that.id) : (that.id != null)) {
            return false;
        }
        if (articleID != null ? !articleID.equals(that.articleID) : (that.articleID != null)) {
            return false;
        }
        if (content != null ? !content.equals(that.content) : (that.content != null)) {
            return false;
        }
        if (lastModified != null ? !lastModified.equals(that.lastModified) : (that.lastModified != null)) {
            return false;
        }
        return user != null ? user.equals(that.user) : (that.user == null);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : HASH_CODE_CONSTANT_2;
        result = HASH_CODE_CONSTANT_1 * result + (articleID != null ? articleID.hashCode() : HASH_CODE_CONSTANT_2);
        result = HASH_CODE_CONSTANT_1 * result + (content != null ? content.hashCode() : HASH_CODE_CONSTANT_2);
        result = HASH_CODE_CONSTANT_1 * result + (lastModified != null ? lastModified.hashCode() : HASH_CODE_CONSTANT_2);
        result = HASH_CODE_CONSTANT_1 * result + (user != null ? user.hashCode() : HASH_CODE_CONSTANT_2);
        return result;
    }

    @Override
    public String toString() {
        return "CommentDto{" +
                "id=" + id +
                "articleID=" + articleID +
                ", content='" + content + '\'' +
                ", lastModified=" + lastModified +
                ", user=" + user +
                ", checked=" + checked +
                '}';
    }
}
