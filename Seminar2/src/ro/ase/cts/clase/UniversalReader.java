
package ro.ase.cts.clase;

import ro.ase.cts.clase.readers.Reader;

import java.io.FileNotFoundException;
import java.util.List;

public class UniversalReader {

    public static List<Aplicant> readAplicants(String filename,Reader reader) throws NumberFormatException, FileNotFoundException{
        return reader.readAplicants(filename);

    }
}