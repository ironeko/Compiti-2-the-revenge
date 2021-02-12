package Ironeko;

import Ironeko.Input.*;

import java.io.IOException;

public class MainTest {

    public static void main(String[] args) {
        String test;
        Studente uno = new Studente("Luchi");
        try {
            FileBinario file = new FileBinario("test", 'w');
            file.scriviFile(uno);
        }
        catch (ModoErratoException e){
            System.out.println("1");
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("2");
            System.out.println(e.getMessage());
        }

    }

    private void test2(){
        try{
            FileBinario file = new FileBinario("test", 'r');
            Studente nome = file.leggiFile(file);
            System.out.println(nome.toString());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
