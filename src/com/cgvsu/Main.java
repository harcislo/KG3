package com.cgvsu;

import com.cgvsu.calculator.PolygonNormalCalculator;
import com.cgvsu.math.Vector3f;
import com.cgvsu.model.Model;
import com.cgvsu.model.Polygon;
import com.cgvsu.objreader.ObjReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileContent = Files.readString(Paths.get("/home/harcislo/Рабочий стол/3sem_update/ObjReaderInitial kg3t/src/com/cgvsu/13041_Beagle_v1_L1.obj"));

        System.out.println("Loading model ...");
        Model model = ObjReader.read(fileContent);

        System.out.println("Vertices: " + model.vertices.size());
        System.out.println("Texture vertices: " + model.textureVertices.size());
        System.out.println("Normals: " + model.normals.size());
        System.out.println("Polygons: " + model.polygons.size());

        //вычисление нормалей
        System.out.println("Calculating normals...");
        for (Polygon polygon : model.polygons) {
            Vector3f normal = PolygonNormalCalculator.calculateNormal(polygon, model.vertices);
            System.out.println("Normal: " + normal);
        }
    }
}