public class ComicBook extends Book {
    private String characterName;

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public double getPrice() {
        System.out.println(getTitle()+ "от" + getAuthor()+ "е намалена с 60%");
        return (1-0.60)*super.getPrice();
    }
}
