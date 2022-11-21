package com.example.belnarto.callback;

import com.example.belnarto.entity.StudentEntity;
import org.reactivestreams.Publisher;
import org.springframework.data.r2dbc.mapping.OutboundRow;
import org.springframework.data.r2dbc.mapping.event.BeforeSaveCallback;
import org.springframework.data.relational.core.sql.SqlIdentifier;
import org.springframework.r2dbc.core.Parameter;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class StudentBeforeSaveCallback implements BeforeSaveCallback<StudentEntity> {

    @Override
    public Publisher<StudentEntity> onBeforeSave(StudentEntity entity, OutboundRow row, SqlIdentifier table) {
//        entity.setAddress("wrongAddress");
        row.put("address", Parameter.from("wrongAddress"));
        return Mono.just(entity);
    }
}
