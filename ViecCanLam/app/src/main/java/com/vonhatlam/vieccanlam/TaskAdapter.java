package com.vonhatlam.vieccanlam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    private List<Task> taskList;

    public TaskAdapter(List<Task> taskList) {
        this.taskList = taskList;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item, parent, false);
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task task = taskList.get(position);
        if (task == null) return;

        holder.txtTenCV.setText(task.getName());
        holder.txtMessage.setText(task.getMessage());
        holder.txtDate.setText(task.getDate());
        holder.txtPriority.setText("Ưu tiên: " + task.getPriority());
    }

    @Override
    public int getItemCount() {
        if (taskList != null) {
            return taskList.size();
        }
        return 0;
    }

    public static class TaskViewHolder extends RecyclerView.ViewHolder {
        private TextView txtTenCV, txtMessage, txtDate, txtPriority;

        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTenCV = itemView.findViewById(R.id.txtItemTenCV);
            txtMessage = itemView.findViewById(R.id.txtItemMessage);
            txtDate = itemView.findViewById(R.id.txtItemDate);
            txtPriority = itemView.findViewById(R.id.txtItemPriority);
        }
    }
}