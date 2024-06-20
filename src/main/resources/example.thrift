namespace java example

struct User {
  1: i32 id,
  2: string name,
  3: string email
}

service UserService {
  User getUserById(1: i32 id),
  void saveUser(1: User user)
}