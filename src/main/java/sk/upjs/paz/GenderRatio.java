package sk.upjs.paz;

public record GenderRatio(
        double boys,
        double girls,
        double unknown
) {
    @Override
    public String toString() {
        return "Ratio is: Boys - " + boys + "%\nGirls - " + girls + "%\nUnknown - " + unknown + "%";
    }
}
