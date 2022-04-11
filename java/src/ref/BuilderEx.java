package contacts;

public class BuilderEx {
    private String id;
    private String userName;
    private String passWord;
    private String email;

    private BuilderEx(String id, String userName, String passWord, String email) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
    }

    @Override
    public String toString() {
        return "BuilderEx{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    static class Builder {
        private String id;
        private String userName;
        private String passWord;
        private String email;

        Builder() {}

        Builder id(String id) {
            this.id = id;
            return this;
        }

        Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        Builder passWord(String passWord) {
            this.passWord = passWord;
            return this;
        }

        Builder email(String email) {
            this.email = email;
            return this;
        }

        BuilderEx build() {
            return new BuilderEx(id,userName,passWord,email);
        }
    }

    public static void main(String[] args) {
        BuilderEx builderEx = new Builder()
                .id("abc")
                .userName("def")
                .passWord("ghi")
                .email("jkl@mno.com")
                .build();
    }
}
