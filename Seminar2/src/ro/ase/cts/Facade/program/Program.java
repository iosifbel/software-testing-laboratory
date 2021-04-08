package ro.ase.cts.Facade.program;

import ro.ase.cts.Facade.clase.Aplicant;
import ro.ase.cts.Facade.clase.UniversalReader;
import ro.ase.cts.Facade.clase.readers.PupilReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        try {
            listaAplicanti = UniversalReader.readAplicants("angajati.txt",new PupilReader());
            for(Aplicant aplicant:listaAplicanti)
                System.out.println(aplicant.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}