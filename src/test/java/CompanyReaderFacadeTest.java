import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import ua.edu.ucu.com.task3.BrandFetchReader;
import ua.edu.ucu.com.task3.Company;
import ua.edu.ucu.com.task3.CompanyReaderFacade;
import ua.edu.ucu.com.task3.PDLReader;
import java.lang.reflect.Field;

class CompanyReaderFacadeTest {

    private CompanyReaderFacade companyReaderFacade;

    @Mock
    private PDLReader pdlReader;

    @Mock
    private BrandFetchReader brandFetchReader;

    @BeforeEach
    void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
        companyReaderFacade = new CompanyReaderFacade();
    
        // Inject mock PDLReader
        Field pdlField = CompanyReaderFacade.class.getDeclaredField("pdlReader");
        pdlField.setAccessible(true);
        pdlField.set(companyReaderFacade, pdlReader);
    
        // Inject mock BrandFetchReader
        Field brandFetchField = CompanyReaderFacade.class.getDeclaredField("brandFetchReader");
        brandFetchField.setAccessible(true);
        brandFetchField.set(companyReaderFacade, brandFetchReader);
    }
    

    @Test
    void testFetchCallsBrandFetchReader() {
        // Arrange
        String companyName = "example";
        Company mockCompanyBF = new Company();
        mockCompanyBF.setName("Example Inc.");
        mockCompanyBF.setDescription("A sample company description.");

        when(brandFetchReader.fetch(companyName)).thenReturn(mockCompanyBF);

        // Act
        Company result = companyReaderFacade.fetch(companyName);

        // Assert
        verify(brandFetchReader, times(1)).fetch(companyName);
        assertNotNull(result);
        assertEquals("Example Inc.", result.getName());
        assertEquals("A sample company description.", result.getDescription());
    }

    @Test
    void testFetchHandlesNullFromBrandFetchReader() {
        // Arrange
        String companyName = "example";

        when(brandFetchReader.fetch(companyName)).thenReturn(null);

        // Act
        Company result = companyReaderFacade.fetch(companyName);

        // Assert
        verify(brandFetchReader, times(1)).fetch(companyName);
        assertNull(result);
    }
}
