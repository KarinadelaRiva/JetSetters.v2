package org.jetsettersv2.utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.File;
import java.io.IOException;

public class JacksonUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    // Metodo para convertir un objeto Java a una cadena JSON
    public static String toJson(Object object) throws JsonProcessingException {
        return objectMapper.writeValueAsString(object);
    }

    // Metodo para convertir una cadena JSON a un objeto Java
    public static <T> T fromJson(String json, Class<T> clazz) throws JsonProcessingException {
        return objectMapper.readValue(json, clazz);
    }


    /* Metodo para leer un archivo JSON y convertirlo en un objeto Java
    *
    * Este metodo fromJsonFile toma la ruta del archivo JSON y la clase del objeto
    * que deseas deserializar, y devuelve una instancia de esa clase.
    */
    public static <T> T fromJsonFile(String filePath, Class<T> clazz) throws IOException {
        return objectMapper.readValue(new File(filePath), clazz);
    }
}
