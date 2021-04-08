
package ro.ase.cts.Facade.clase;

import ro.ase.cts.Facade.clase.readers.Reader;

import java.io.FileNotFoundException;
import java.util.List;

public class UniversalReader {

    public static List<Aplicant> readAplicants(String filename,Reader reader) throws NumberFormatException, FileNotFoundException{
        return reader.readAplicants(filename);

    }
}