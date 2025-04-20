package github.rafael.service;

import github.rafael.controller.dto.UserDTO;
import github.rafael.models.UserModel;
import github.rafael.repository.UserRepository;
import github.rafael.service.validation.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository =  userRepository;
    }

    public UserModel treatmentInnate(UserDTO dto){
        UserModel userModel = usersRefactor(new UserModel(dto.getName(), dto.getEmail()));
        if(userModel!=null){
            UserModel userModelSearch = userRepository.searchValue(userModel);
            if(userModelSearch != null){
                return userModelSearch;
            }
            else {
                userRepository.saveUser(userModel);
                return userModel;
            }
        }
        return null;

    }

    private UserModel usersRefactor(UserModel userModel){
        userModel.setNmUser(UserValidation.validationName(userModel.getNmUser()));
        if(!UserValidation.emailValid(userModel.getDsEmail())){
            return null;
        }
        return userModel;
    }
}
