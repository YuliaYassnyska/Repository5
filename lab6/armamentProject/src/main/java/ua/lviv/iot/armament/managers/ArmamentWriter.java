package ua.lviv.iot.armament.managers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import ua.lviv.iot.armament.model.Armament;

public class ArmamentWriter {

	public static void writeToFile(List<Armament> armaments)

      throws FileNotFoundException, IOException {

    File file = new File("out.csv");

    try (FileOutputStream fos = new FileOutputStream(file);

        OutputStreamWriter osw = new OutputStreamWriter(fos);

        BufferedWriter bufWriter = new BufferedWriter(osw);) {

      for (Armament armament:armaments) {

        bufWriter.write(

            armament.getHeaders() + "\n"

            		+ armament.toCSV() + "\n"
        );
      }
    } finally {
      System.out.println();
    }
  }
}