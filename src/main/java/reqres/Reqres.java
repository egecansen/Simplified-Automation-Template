package reqres;

import api_assured.ApiUtilities;
import api_assured.ResponsePair;
import api_assured.ServiceGenerator;
import models.*;
import retrofit2.Call;
import retrofit2.Response;

public class Reqres extends ApiUtilities {

    static ReqresServices reqresServices = new ServiceGenerator().generate(ReqresServices.class);

    public UsersListResponse getUserList(String page) {
        log.info("Acquiring list of users from page number " + page);
        Call<UsersListResponse> getUsersListCall = reqresServices.getUsers(page);
        return perform(getUsersListCall, true, true);
    }

    public GetUserResponse getUser(String id) {
        log.info("Acquiring the user with id " + id);
        Call<GetUserResponse> getUserCall = reqresServices.getUser(id);
        return perform(getUserCall, true, true);
    }

    public ResponsePair<Response<LoginResponse>, LoginErrorResponse> login(UserLoginRequest userLoginRequest) {
        log.info("Logging in with " + userLoginRequest.getEmail());
        Call<LoginResponse> registerCall = reqresServices.login(userLoginRequest);
        return getResponse(registerCall, false, true, LoginErrorResponse.class);
    }

    public UpdateUserResponse updateUser(GenericUserRequest genericUserRequest, String id) {
        log.info("Updating the user with id " + id);
        Call<UpdateUserResponse> updateUserCall = reqresServices.updateUser(genericUserRequest, id);
        return perform(updateUserCall, true, true);
    }

    public Response<Void> deleteUser(String id) {
        log.info("Deleting user..." );
        Call<Void> deleteUserCall = reqresServices.deleteUser(id);
        return getResponse(deleteUserCall, true, true);
    }

    public Response<CreateUserResponse> createDelayedUser(GenericUserRequest genericUserRequest, String delay) {
        log.info("Creating delayed user..." );
        Call<CreateUserResponse> createUserCall = reqresServices.createDelayedUser(genericUserRequest, delay);
        return getResponse(createUserCall, true, true);
    }

}
