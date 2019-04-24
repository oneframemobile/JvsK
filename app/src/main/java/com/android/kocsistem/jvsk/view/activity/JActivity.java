package com.android.kocsistem.jvsk.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public final class JActivity extends AppCompatActivity {

  private static final String ID = "id";

  public static void start(@NonNull Context context) {
    start(context, null);
  }

  public static void start(@NonNull Context context, @Nullable Long id) {
    Intent starter = new Intent(context, JActivity.class);
    starter.putExtra(ID, id);
    context.startActivity(starter);
  }

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override
  protected void onResume() {
    super.onResume();
  }

  @Override
  protected void onPause() {
    super.onPause();
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
  }
}
