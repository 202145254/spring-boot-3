package com.atwt.boot.component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/**
 * @BelongsProject: spring-boot-3
 * @BelongsPackage: com.atwt.boot.component
 * @Author: wutao
 * @CreateTime: 2023-06-24  17:11
 * @Description: TODO
 * @Version: 1.0
 */
public class MyYamlHttpMessageConverter extends AbstractHttpMessageConverter {
    private ObjectMapper objectMapper=null;
    public MyYamlHttpMessageConverter(){
        //告诉springboot这个messageconverter支持那种媒体类型
        super(new MediaType("text","yaml", Charset.forName("UTF-8")));
        this.objectMapper = new ObjectMapper(new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER));
    }
    @Override
    protected boolean supports(Class clazz) {
        return true;
    }

    @Override //requesbody
    protected Object readInternal(Class clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override //responsebody
    protected void writeInternal(Object methodReturnValue, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        //try-with写法，自动关流
        try(OutputStream body = outputMessage.getBody()) {
            this.objectMapper.writeValue(body, methodReturnValue);
        }
    }
}
