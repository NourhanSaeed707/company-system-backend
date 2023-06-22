package  com.example.authmanage.service.Impl;

import com.example.authmanage.entity.Role;
import com.example.authmanage.entity.UserEntity;
import com.example.authmanage.model.User;
import com.example.authmanage.repository.UserRepository;
import com.example.authmanage.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
//    @Autowired
//    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public UserEntity createAdmin(UserEntity user) {
//        user.setRole("ROLE_ADMIN");
//        user.setPassword(this.passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return user;
    }
}
