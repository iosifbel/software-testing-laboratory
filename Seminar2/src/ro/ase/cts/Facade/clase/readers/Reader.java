
package ro.ase.cts.Facade.clase.readers;

import ro.ase.cts.Facade.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class Reader {

    public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException, NumberFormatException;


}
