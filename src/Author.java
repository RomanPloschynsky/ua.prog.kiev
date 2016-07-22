/**
 * Created by exite on 21.07.16.
 */
public class Author {
    private String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public static Author makeRndmAuthor(int n){
        String authorName = new String();
        Author author = new Author(authorName);
        switch (n) {
            case 1: authorName = "Arturo Peres Reverte";
                break;
            case 2: authorName = "Lina Kostenko";
                break;
            case 3: authorName = "Den Broun";
                break;
            case 4: authorName = "Ain Rend";
                break;
            case 5: authorName = "Ivan Franko";
                break;
            default: authorName = "Taras Shevchenko";
                break;

        }
        return author;
    }

}
