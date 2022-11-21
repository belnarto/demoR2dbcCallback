package com.example.belnarto.callback;

import org.reactivestreams.Publisher;
import org.springframework.data.r2dbc.mapping.OutboundRow;
import org.springframework.data.r2dbc.mapping.event.AfterSaveCallback;
import org.springframework.data.r2dbc.mapping.event.BeforeSaveCallback;
import org.springframework.data.relational.core.sql.SqlIdentifier;

@FunctionalInterface
public interface BaseBeforeSaveCallback<T> extends BeforeSaveCallback<T>, AfterSaveCallback<T> {

    @Override
    default Publisher<T> onBeforeSave(T entity, OutboundRow row, SqlIdentifier table) {

        return null;
    }

    Publisher<T> onBeforeSave(T entity);

}
