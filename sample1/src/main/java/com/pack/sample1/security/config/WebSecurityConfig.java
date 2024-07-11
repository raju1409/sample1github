// package com.pack.sample1.security.config;


// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

// import lombok.AllArgsConstructor;

// // @Configuration
// // @AllArgsConstructor
// // @EnableWebSecurity
// public class WebSecurityConfig  {

//     // private final AppUserService appUserService;
//     // private final BCryptPasswordEncoder bCryptPasswordEncoder;

//     // @Override
//     // protected void configure(HttpSecurity http) throws Exception {
//     //     http
//     //             .csrf().disable()
//     //             .authorizeRequests()
//     //                 .antMatchers("/api/v*/registration/**")
//     //                 .permitAll()
//     //             .anyRequest()
//     //             .authenticated().and()
//     //             .formLogin();
//     // }

//     // protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//     //     auth.authenticationProvider(daoAuthenticationProvider());
//     // }

//     // @Bean
//     // public DaoAuthenticationProvider daoAuthenticationProvider() {
//     //     DaoAuthenticationProvider provider =
//     //             new DaoAuthenticationProvider();
//     //     provider.setPasswordEncoder(bCryptPasswordEncoder);
//     //     provider.setUserDetailsService(appUserService);
//     //     return provider;
//     // }
// }