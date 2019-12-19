/*
 * Copyright 2019 Adrian Bueno Olmedo - adrian.bueno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.io.BufferedReader;
import java.io.FileReader;
//import org.japo.java.libraries.UtilesAleatorios;

/**
 *
 * @author Adrián Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public final class App {

//  Array de nombres
    public static final String[] LISTA_NOM = {
        "Manolo", "Felisa", "Victor", "Irene", "Paco", "Sonia"
    };
    public static final String[] LISTA_APE = {
        "Garcia", "Martinez", "Perez", "Monteverde", "Sanchez", "Vazquez"
    };

    public final void launchApp() {
        try {
            FileReader fr = new FileReader("palabras.txt");
            BufferedReader br = new BufferedReader(fr);
            boolean lecturaOK = true;
            do {
                String linea = br.readLine();
                if (linea == null) {
                    lecturaOK = false;
                } else {
                    System.out.println("Palabra: " + linea);
                }
            } while (lecturaOK);
        } catch (Exception e) {
            System.out.println("No funsiona amigo");
        }

//        System.out.println(LISTA_NOM[
//                UtilesAleatorios.RND.nextInt(LISTA_NOM.length)]);
//        
//        for (int i = 0; i < 5; i++) {
//            String nombr = LISTA_NOM[UtilesAleatorios.RND.nextInt(LISTA_NOM.length)];
//            String ape01 = LISTA_APE[UtilesAleatorios.RND.nextInt(LISTA_APE.length)];
//            String ape02 = LISTA_APE[UtilesAleatorios.RND.nextInt(LISTA_APE.length)];
//            
//            String persona = String.format("%s %s %s", ape01, ape02, nombr);
//            
//            System.out.printf("Persona %02d - %s%n", i + 1, persona);
//        }
    }
}
