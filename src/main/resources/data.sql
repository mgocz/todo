INSERT INTO `user` (`id`, `username`, `password`, `role`, `enabled`) VALUES
  (1, 't', '$2a$06$WIaZCw/jJXAJ8pvhvSYDS.1jDBvvSRgBMKjgBjA/M0T2wYtpD4MmC', 'ROLE_GUEST', 1), /*pwd: t*/
  (2, 'user', '$2a$06$zcmu8ZWRx5vnaQC30t3pJ.O3i2wvp7uNf97yzsWItxoi7MCpictKK', 'ROLE_USER', 1), /*pwd: user*/
  (3, 'admin', '$2a$06$IQACzDoIe0xUAupeycYrteu432CGaA7YCe078s2aSTSaOuMjaBUOC', 'ROLE_ADMIN', 1 /*pwd: admin*/);