/**
 * Created by exite on 21.07.16.
 */
public class Cover {
    private char coverType;
    private String coverName;

    public Cover() {
    }

    public char getCoverType() {
        return coverType;
    }

    public void setCoverType(char coverType) {
        this.coverType = coverType;
    }

    public String getCoverName() {
        return coverName;
    }

    public void setCoverName(String coverName) {
        this.coverName = coverName;
    }

    public static Cover makeRndmCvr(int n) {
        Cover cover = new Cover();
        switch (n) {
            case 2:
                cover.coverType = 's';
                cover.coverName = "Мягкий переплет";
                break;
            case 3:
                cover.coverType = 's';
                cover.coverName = "Мягкий переплет";
                break;
            default:
                cover.coverType = 'h';
                cover.coverName = "Твердый переплет";
                break;
        }
        return cover;
    }
}
