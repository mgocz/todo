INSERT INTO `user` (`id`, `username`, `password`, `role`, `enabled`) VALUES
  (1, 't', '$2a$06$WIaZCw/jJXAJ8pvhvSYDS.1jDBvvSRgBMKjgBjA/M0T2wYtpD4MmC', 'ROLE_GUEST', 1), /*pwd: t*/
  (2, 'user', '$2a$06$zcmu8ZWRx5vnaQC30t3pJ.O3i2wvp7uNf97yzsWItxoi7MCpictKK', 'ROLE_USER', 1), /*pwd: user*/
  (3, 'admin', '$2a$06$IQACzDoIe0xUAupeycYrteu432CGaA7YCe078s2aSTSaOuMjaBUOC', 'ROLE_ADMIN', 1 /*pwd: admin*/);

INSERT INTO `todo` (`id`, `date`, `description`, `user_id`) VALUES
  (1, {ts '2017-09-27 11:47:52.69'}, 'Wyscie w piątek', 2),
  (2, {ts '2017-08-17 19:34:52.69'}, 'Dentysta', 2),
  (3, {ts '2017-10-09 17:24:52.69'}, 'Wycieczka nad morze', 3);