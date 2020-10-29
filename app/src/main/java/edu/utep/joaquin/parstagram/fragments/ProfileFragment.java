package edu.utep.joaquin.parstagram.fragments;

import android.util.Log;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.List;

import edu.utep.joaquin.parstagram.Post;

public class ProfileFragment extends PostsFragment {

    @Override
    protected void queryPosts() {
        super.queryPosts();
        ParseQuery<Post> query = ParseQuery.getQuery(Post.class);
        query.include(Post.KEY_USER);
        query.whereEqualTo(Post.KEY_USER, ParseUser.getCurrentUser() );

        query.setLimit(20);
        query.addDescendingOrder(Post.KEY_CREATED_KEY);

        query.findInBackground(new FindCallback<Post>() {
            @Override
            public void done(List<Post> posts, ParseException e) {
                if(e != null){
                    Log.e("abc123", "Issue with getting posts");
                }
                //Success!

                //Iterate thru all posts
                for(Post post: posts){
                    Log.d("abc123", "Post:"+ post.getDescription() );
                    Log.d("abc123", "Username:"+ post.getUser().getUsername() );
                }
                allPosts.addAll(posts);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
