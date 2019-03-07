package example.org.test.week04day03sol;

import example.org.test.week04day03sol.model.users.RepoResponse;
import example.org.test.week04day03sol.model.users.UserResponse;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

import static example.org.test.week04day03sol.UrlConstants.BASE_URL;
import static example.org.test.week04day03sol.UrlConstants.USER_PATH;

public class RetrofitHelper {
    private Retrofit getRetrofitClient() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                //Uses gson behind the scenes to make the result object
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    private GetUser getUserResponse() {
        return getRetrofitClient().create(GetUser.class);
    }

    public Call<UserResponse> getUserProfile(){
        return getUserResponse().getUserProfile();
    }
    public interface GetUser{
        @GET(USER_PATH)
        Call<UserResponse> getUserProfile();
    }

    private GetUser getUserRpo() {
        return getRetrofitClient().create(GetRepo.class);
    }
    public Call<RepoResponse> getRepoProfile(){
        return getUserRpo().getRepoProfile();
    }
    public interface GetRepo{
        @GET(USER_PATH)
        Call<RepoResponse> getRepoProfile();
    }

}
