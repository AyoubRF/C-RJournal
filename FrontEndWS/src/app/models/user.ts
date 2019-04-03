// this interface for role to respect the form of subject send in the Json web token from the backend,
//we can considirate it our model here in the front
export interface User{
    firstname : string;
    lastname : string;
    username : string;
    email : string;
    role : string[];
    phoneNumber: string;
}