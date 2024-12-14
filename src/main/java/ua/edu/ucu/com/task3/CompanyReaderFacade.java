package ua.edu.ucu.com.task3;

public class CompanyReaderFacade {
    private PDLReader pdlReader;
    private BrandFetchReader brandFetchReader;

    public CompanyReaderFacade() {
        this.pdlReader = new PDLReader();
        this.brandFetchReader = new BrandFetchReader();
    }

    public Company fetch(String companyName) {
        // Company companyPdl = pdlReader.fetch(companyName);
        Company companyBF = brandFetchReader.fetch(companyName);

        // TODO merge info
        return companyBF;
    }
}
