public class ChildrenBook extends Book{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public double getPrice() {
        System.out.println(getTitle()+ "от" + getAuthor()+ "е намалена с 70%");
        return (1-0.70)*super.getPrice();
    }
}
