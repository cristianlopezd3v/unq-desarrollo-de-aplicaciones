package cleancode.example.examples.statements.support;

public class DataSummaryError extends RuntimeException {

    private static final long serialVersionUID = 2776246082661611982L;

    public DataSummaryError(final FileData data) {
        throw new UnsupportedOperationException();
    }

}
