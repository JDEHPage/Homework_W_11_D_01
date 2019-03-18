public class Printer {

    private int paperAmount;
    private int tonerVolume;

    public Printer(int paperAmount, int tonerVolume){
        this.paperAmount = paperAmount;
        this.tonerVolume = tonerVolume;
    }

    public int getPaperAmount() {
        return paperAmount;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void printCopies(int copies, int pages) {
        if (paperAmount >= copies * pages) {
            paperAmount -= copies * pages;
            tonerVolume -= copies * pages;
        }
    }

    public int fillPaper(){
        return paperAmount = 100;
    }



}
