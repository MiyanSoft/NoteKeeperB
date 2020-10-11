package com.example.notekeeper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class NoteReminderReceiver extends BroadcastReceiver {
    public static final String EXTRA_NOTE_TITLE = "com.example.notekeeper.extra.NOTE_TITLE";
    public static final String EXTRA_NOTE_TEXT = "com.example.notekeeper.extra.NOTE_TEXT";
    public static final String EXTRA_NOTE_ID = "com.example.notekeeper.extra.NOTE_ID";

    @Override
    public void onReceive(Context context, Intent intent) {
        //use intent to access the extras declared above and assign them to local variables
        String noteTitle = intent.getStringExtra(EXTRA_NOTE_TITLE);
        String noteText = intent.getStringExtra(EXTRA_NOTE_TEXT);
        String noteId = intent.getStringExtra(EXTRA_NOTE_ID);

        //display notification


    }
}
