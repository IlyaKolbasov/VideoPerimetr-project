import * as React from 'react';
import {useState} from 'react';
import {Controller, SubmitHandler, useForm, useFormState} from "react-hook-form";
import {
    Alert, AlertTitle,
    Avatar,
    Box,
    Button,
    Container,
    createTheme,
    CssBaseline, Fade,
    Grid,
    Link,
    TextField,
    ThemeProvider,
    Typography
} from "@mui/material";
import LockOutlinedIcon from '@mui/icons-material/LockOutlined';
import {registration,login} from "./http/UserApi";

const theme = createTheme();

const LoginPage = () => {
    const [isAuth, setIsAuth] = useState(true);
    const [alertVisibility, setAlertVisibility] = useState({
        value: false,
        isSucceed: false,
        title: '',
        text: ''
    });

    const {handleSubmit, control, reset} = useForm({
        mode: 'onChange',
        defaultValues: {
            firstname: '',
            lastname: '',
            email: '',
            password: '',
        }
    });
    const {errors} = useFormState({
        control
    });

    const onSubmit = async (data) => {
        let response;
        if (isAuth) {
            response = await login(data);
        } else {
            response = await registration(data);
        }
    }

    const onClick = () => {
        setIsAuth(!isAuth);
    }

    return (
        <ThemeProvider theme={theme}>
            <Container component="main" maxWidth="xs">
                <CssBaseline/>
                <Box
                    sx={{
                        paddingTop: 8,
                        paddingBottom: 8,
                        paddingLeft: 2,
                        paddingRight: 2,
                        display: 'flex',
                        flexDirection: 'column',
                        alignItems: 'center',
                    }}
                >
                    <Avatar sx={{m: 1, bgcolor: 'secondary.main'}}>
                        <LockOutlinedIcon/>
                    </Avatar>
                    <Typography component="h1" variant="h5">
                        {
                            isAuth ? 'Sign in' : 'Sign up'
                        }
                    </Typography>
                    {alertVisibility.value &&
                        <Fade
                            in={alertVisibility.value}
                            timeout={{enter: 1000, exit: 1000}}
                            addEndListener={() => {
                                setTimeout(() => {
                                    setAlertVisibility({...alertVisibility, value: false})
                                }, 2000);
                            }}
                        >
                            <Alert severity={alertVisibility.isSucceed ? "success" : "error"} variant="standard"
                                   className="alert" sx={{mb: 3}}>
                                <AlertTitle>{alertVisibility.title}</AlertTitle>
                                {alertVisibility.text}
                            </Alert>
                        </Fade>
                    }
                    <Box component="form" onSubmit={handleSubmit(onSubmit)} sx={{mt: 3}}>
                        <Grid container spacing={2}>
                            {
                                !isAuth && <Grid item xs={12} sm={6}>
                                    <Controller
                                        control={control}
                                        name='firstname'
                                        render={({
                                                     field: {onChange, value}
                                                 }) => (
                                            <TextField
                                                fullWidth
                                                id="firstname"
                                                label="First Name"
                                                autoFocus
                                                onChange={onChange}
                                                value={value}
                                            />
                                        )}
                                    />
                                </Grid>

                            }
                            {
                                !isAuth && <Grid item xs={12} sm={6}>
                                    <Controller
                                        control={control}
                                        name='lastname'
                                        render={({
                                                     field: {onChange, value}
                                                 }) => (
                                            <TextField
                                                fullWidth
                                                id="lastname"
                                                label="Last Name"
                                                onChange={onChange}
                                                value={value}
                                            />
                                        )}
                                    />
                                </Grid>
                            }
                            <Grid item xs={12}>
                                <Controller
                                    control={control}
                                    name='email'
                                    render={({
                                                 field: {onChange, value}
                                             }) => (
                                        <TextField
                                            autoFocus
                                            fullWidth
                                            id="email"
                                            label="Email Address"
                                            onChange={onChange}
                                            value={value}
                                        />
                                    )}
                                />
                            </Grid>
                            <Grid item xs={12}>
                                <Controller
                                    control={control}
                                    name='password'
                                    render={({
                                                 field: {onChange, value}
                                             }) => (
                                        <TextField
                                            fullWidth
                                            label="Password"
                                            type="password"
                                            id="password"
                                            onChange={onChange}
                                            value={value}

                                        />
                                    )}
                                />
                            </Grid>
                        </Grid>
                        <Button
                            type="submit"
                            fullWidth
                            variant="contained"
                            sx={{mt: 3, mb: 2}}
                            className="sign-button sign-button-modal"
                        >
                            {
                                isAuth ? 'Sign in' : 'Sign up'
                            }
                        </Button>
                        <Grid container justifyContent="flex-end">
                            <Grid item>
                                <Link href="#" variant="body2" onClick={onClick}>
                                    {
                                        isAuth ? "Don't have an account? Sign Up" : "Already have an account? Sign in"
                                    }
                                </Link>
                            </Grid>
                        </Grid>
                    </Box>
                </Box>
            </Container>
        </ThemeProvider>
    )
}

export default LoginPage;