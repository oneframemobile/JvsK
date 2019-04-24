package com.android.kocsistem.jvsk.view.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public final class JAdapter extends RecyclerView.Adapter<JAdapter.Holder> {

  private final List<Object> mList;

  public JAdapter(List<Object> list) {
    mList = list;
  }

  @NonNull
  @Override
  public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int type) {
    View cell =
        LayoutInflater.from(viewGroup.getContext())
            .inflate(android.R.layout.activity_list_item, viewGroup, false);
    return new Holder(cell);
  }

  @Override
  public void onBindViewHolder(@NonNull Holder holder, int position) {
    if (holder instanceof Holder) {
      // TODO Bind your views
    }
  }

  @Override
  public int getItemCount() {
    return mList.size();
  }

  class Holder extends RecyclerView.ViewHolder {

    Holder(@NonNull View itemView) {
      super(itemView);
    }
  }
}
