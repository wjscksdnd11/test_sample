package com.example.smaple_v;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.smaple_v.datas.Container;
import com.example.smaple_v.datas.Repo;
import com.example.smaple_v.datas.User;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<Container> mDatas = new ArrayList<>();

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == Constants.USER) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_item, parent, false);
            return new UserViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.repo_item, parent, false);
            return new RepoViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof UserViewHolder) {
            UserViewHolder userViewHolder = (UserViewHolder) holder;
            userViewHolder.bind((User) mDatas.get(position).data);
        } else {
            RepoViewHolder repoViewHolder = (RepoViewHolder) holder;
            repoViewHolder.bind((Repo) mDatas.get(position).data);
        }

    }

    public void replaceUser(Container container) {
        if (mDatas.size()>0 && mDatas.get(0).data instanceof User) {
            mDatas.set(0, container);
        } else {
            mDatas.add(0, container);
        }
        notifyItemChanged(0);
    }

    public void replaceRepository(List<Container> containers) {
        Container userCon;
        if (mDatas.size() > 0 && mDatas.get(0).data instanceof User) {
            userCon = mDatas.get(0);
            mDatas.clear();
            mDatas.addAll(containers);
            mDatas.add(0, userCon);
            notifyItemChanged(1, mDatas.size() - 1);
        } else {
            mDatas.clear();
            mDatas.addAll(containers);
            notifyDataSetChanged();
        }
    }

    @Override
    public int getItemViewType(int position) {
        return mDatas.get(position).viewType;
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        private ImageView profileImage;
        private TextView nameView;

        UserViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImage = itemView.findViewById(R.id.profile);
            nameView = itemView.findViewById(R.id.name);
        }

        void bind(User user) {

            Glide.with(itemView.getContext()).load(user.getAvatarUrl())

                    .diskCacheStrategy(DiskCacheStrategy.NONE).into(profileImage);
            nameView.setText(user.getName());
        }
    }

    public static class RepoViewHolder extends RecyclerView.ViewHolder {
        private TextView nameTextView;
        private TextView descriptionTextView;
        private TextView star;

        public RepoViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTextView = itemView.findViewById(R.id.name);
            descriptionTextView = itemView.findViewById(R.id.description);
            star = itemView.findViewById(R.id.star_count);

        }

        void bind(Repo repo) {
            nameTextView.setText(repo.name);
            descriptionTextView.setText(repo.description);
            star.setText(String.valueOf(repo.stargazersCount));
        }

        ;
    }
}
