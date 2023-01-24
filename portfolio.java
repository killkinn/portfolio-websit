body {
    margin: 0px;
    padding: 0PX;
    background-color: #161616;
}

html {
    scroll-behavior: smooth;
}

ul {
    list-style: none;
}

a {
    text-decoration: none;
}

.toggle {
    display: none;
}

.main {
    width: 100%;
    height: 100vh;
    box-sizing: border-box;
    background-color: #edf1fd;
    position: relative;
    background-image: url(photo_2022-08-31_18-01-45.jpg);
    background-repeat: no-repeat;
    background-size: 350px;
    background-position: right bottom;
}

nav {
    display: flex;
    justify-content: space-between;
    align-items: center;
    text-transform: uppercase;
    font-weight: 600;
    letter-spacing: 2px;
    font-family: calibri;
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    box-sizing: border-box;
    padding: 10px 50px;
    background-color: #f4f7ff;
    box-shadow: 2px 2px 12px rgb(0, 0, 0.05)0;
    z-index: 1;

}

.menu {
    display: flex;

}

.menu li a {
    padding: 10px 15px;
    color: #6c707c;
    font-size: 18px;
}

.lang {
    color: #292929;
}

.logo {
    font-size: 25px;
    font-weight: bold;
    color: #292929;
    font-family: poppins;
}

.menu li a:hover,
.menu li a.active {

    background-color: #292929;
    color: #FFFFFF !important;
    font-weight: 700;
    transition: all ease 0.4s;
}

.name {
    font-family: calibri;
    width: 500px;
    position: absolute;
    left: 20%;
    top: 50%;
    transform: translate(-20%, -50%);
}

.name p:nth-child(1),
.name .details {
    color: #6c707c;
    font-size: 16px;
}

.name h1 {
    font-family: poppins;
    font-size: 40px;
    margin: 0px;
    letter-spacing: 3px;
    color: #292929;

}

.cv-btn {
    width: 200px;
    height: 45px;
    display: flex;
    justify-content: center;
    align-items: center;
    background-color: #292929;
    color: #FFFFFF;

}

.cv-btn:hover {
    background-color: #131313;
    transition: all ease 0.5s;

}

.social {
    position: absolute;
    left: 50px;
    bottom: 50px;
    display: flex;
}

.social a {
    margin: 6px 12px;
}

.social i {
    color: rgb(18, 17, 17, o.4);
    font-size: 14px;
}

.social a:hover i {
    color: #17d1ac;
    transition: all ease 0.5s;

}

.arrow {
    align-self: end;
    width: 50%;
    height: 15%;
    margin-bottom: 4em;
    position: absolute;
    bottom: 0px;
    left: -3%;
    border-right: 1px solid rgb(41, 41, 41, 0.3);
}

.arrow::after {
    content: '';
    position: absolute;
    width: 0;
    height: 0;
    border-style: solid;
    border-width: 11px 11px 0px 11px;
    border-color: #292929 transparent transparent transparent;
    right: -0.7em;
    bottom: -2px;
}

#about {
    width: 100%;
    height: 100vh;
    box-sizing: border-box;
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 50px 5% 0px 5%;
}

.about-text {
    font-family: calibri;
    width: 50%;
}

.about-text h1 {
    font-size: 5rem;
    color: #17d1ac;
}

.p-b-container {
    width: 100%;
}


.about-text h2 {
    font-size: 3rem;
    color: #FFFFFF;
    font-weight: 400;
}

.img2 {
    height: 450px;
    width: 350px;
}

.about-text h1,
h2 {
    margin: 0px;
    padding: 0px;

}

.about-text p {
    font-size: 1.2rem;
    color: rgba(251, 251, 251, 0.90);
}

.about-text button {
    width: 180px;
    height: 40px;
    border-radius: 20px;
    border: none;
    outline: none;
    background-color: #17d1ac;
}

.about-text button:hover {
    background-color: #FFFFFF;
    transition: all ease 0.3s;
}

#services {
    width: 100%;
    height: 100vh;
    font-family: calibri;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    padding-top: 40px;
}

.s-heading h1 {
    color: #FFFFFF;
    font-size: 3rem;
    margin: 0px;
    padding: 0px;

}

.s-heading p {
    color: rgba(249, 249, 249, 0.30);
    font-size: 1rem;
    margin: 0px;
    padding: 0px;

}

s.heading {
    text-align: center;
    margin: 20px 0px;
}

.s-box {
    background-color: #2b2b2b;
    width: 350px;
    height: 500px;
    margin: 20px;
    border-radius: 10px;
    overflow: hidden;
    box-shadow: 2px 2px 12px rgba(0, 0, 0, 0.1);

}

.s-b-container {
    display: flex;
    justify-content: center;
    align-items: center;
}

.s-b-img {
    width: 100%;
    height: 70%;
}

.s-b-img img {
    width: 100%;
    height: 100%;
    object-fit: cover;
}

.s-b-text {
    width: 100%;
    height: 30%;
    background-color: #1e1e1e;
    display: flex;
    justify-content: center;
    align-items: center;
}

.s-b-text a {

    margin: 0px;
    color: #FFFFFF;
    font-size: 1.1rem;
    font-family: calibri;
    display: block;
    display: -webkit-box;
    max-width: 80%;
    -webkit-line-clamp: 4;
    overflow: hidden;
    text-overflow: ellipsis;
    -webkit-box-orient: vertical;
}

.s-type {
    font-family: calibri;
    color: #FFFFFF;
    background-color: #151515;
    padding: 10px 5px;
    position: absolute;
    top: 0px;
    transform: translateX(-50%);
    font-size: 18px;
    border-radius: 0px 0px 10px 10px;
    box-shadow: 2px 2px 12px rgba(0, 0, 0, 0.2);
}

.s-box:hover {
    transform: translateY(-10px);
    transition: all ease 0.3s;
}

.s-b-text a:hover {
    color: rgba(255, 255, 255, 0.50);
}

#portfolio {
    width: 100%;
    box-sizing: border-box;
    font-family: calibri;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    padding: 60px 2% 20px 2%;

}

.p-heading {
    font-family: calibri;
    font-size: 1.7rem;
    text-align: center;
    color: #FFFFFF;
    font-weight: 400;
    padding: 10px 20px;
    background-color: #292929;
    letter-spacing: 2px;
    border-radius: 3px;
    box-shadow: 2px 2px 20px rgba(0, 0, 0, 0.1);

}

.p-box {
    background-color: #1f1f1f;
    overflow: hidden;
    border-radius: 10px;
    box-shadow: 2px 2px 13px rgba(0, 0, 0, 0.3);
    position: relative;

}

.p-box img {
    width: 100%;
    height: 100%;
    object-fit: cover;


}

.p-container {
    width: 90%;
    height: 70vh;
    display: grid;
    grid-template-columns: 1fr 1fr 1fr;
    grid-template-rows: auto auto;
    grid-gap: 10px;

}

.overlay-text {
    font-family: calibri;
    position: absolute;
    left: 0;
    top: 0;
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    background-color: rgba(23, 209, 172, 0.80);
    display: none;

}

.overlay-text h1,
p {
    color: #FFFFFF;
}

.overlay-text h1 {
    font-size: 2.2rem;
    margin: 0px;
    padding: 0px;
    letter-spacing: 2px;

}

.overlay-text p {
    font-size: 1.2rem;
    margin: 0px;


}

.p-box:hover .overlay-text {
    display: flex;


}

#contact-btn h1 {
    font-size: 2rem;
    color: #1e1e1e;
    font-family: calibri;
    margin: 10px;
    padding: 5px;
    letter-spacing: 4px;
    border-bottom: 2px solid #1E1E1E;
}

#contact-btn {
    width: 100%;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    height: 200px;
    background-color: #F4F7FF;
    margin: 20px 0px;
    box-sizing: border-box;
    box-shadow: 2px 0px 20px rgba(0, 0, 0, 0.4);
}

.c-b-heading {
    font-size: 2rem;
    color: #1E1E1E;
    font-family: calibri;
    margin: 10px;
    padding: 5px;
    letter-spacing: 4px;
    border-bottom: 2px solid #1E1E1E;

}

#contact-btn button {
    color: #FFFFFF;
    font-size: 1rem;
    font-family: calibri;
    width: 150px;
    height: 40px;
    margin: 10px;
    background-color: #1E1E1E;
    border: none;
    outline: none;
    box-shadow: 2px 5px 6px rgba(0, 0, 0, 0.2);
}

#contact-btn button:hover {
    background-color: #17d1ac;
    color: #000000;
    transition: all ease 0.5s;
    font-weight: bold;
}

#contact-form {
    width: 100%;
    height: 90vh;
    display: flex;
    justify-content: center;
    align-items: center;

}

#contact-form form {
    display: flex;
    width: 70%;
    height: 60vh;
    background-color: #1A1A1A;
    box-shadow: 2px 12px 20px rgba(0, 0, 0, 0.2);
    border: 1px solid rgba(255, 255, 255, 0.01)
}

.contact-left {
    width: 40%;
    height: 100%;
    display: flex;
    flex-direction: column;
    align-items: center;
}

.contact-right {
    width: 60%;
    height: 100%;
    box-sizing: border-box;
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    border-left: 1px solid rgba(255, 255, 255, 0.08);
}

.contact-right button {
    width: 100%;
    height: 50px;
    background-color: #1ED98B;
    font-weight: bold;
    outline: none;
    border: none;
    margin: 0px;
    color: #1B1B1B;
    font-size: 14px;
    text-transform: uppercase;
    letter-spacing: 2px;

}

.c-l-heading {
    font-family: calibri;
    color: #FFFFFF;
    font-size: 3rem;
    letter-spacing: 2px;
    font-weight: 400;

}

.f-name,
.f-email {
    display: flex;
    flex-direction: column;
    font-family: calibri;

}

.f-name font,
.f-email font {
    color: #BFBFBF;
    font-size: 22px;
}

.f-name input,
.f-email input {
    height: 30px;
    width: 250px;
    border: none;
    outline: none;
    background-color: transparent;
    border-bottom: 1px solid #929292;
    color: #FFFFFF;
    margin: 10px 0px;
}

.f-email input::placeholder,
.f-name input::placeholder {
    opacity: 0.5;
    letter-spacing: 1px;
}

.f-email input:focus,
.f-name input:focus {
    border-bottom: 1px solid #17d1ac;
    transition: all ease 0.5s;
}

.message font {
    font-size: 18px;
    color: #4E4E4E;
    font-family: calibri;

}

.message {
    margin: 20px;
    display: flex;
    flex-direction: column;
}

.contact-right textarea {
    width: 100% !important;
    height: 320px !important;
    border: none;
    outline: none;
    background-color: transparent;
    box-sizing: border-box;
    color: #EBEBEB;
    font-size: 16px;
}

.contact-right textarea::placeholder {
    color: #EBEBEB;
    font-size: 18px;
    letter-spacing: 2px;
    font-family: calibri;
}

.contact-right button:active {
    transform: scale(1.04);
    transition: all ease 0.1s;
}

.contact-right button {
    width: 100%;
    height: 50px;
    background-color: #1ed98b;
    font-weight: bold;
    outline: none;
    border: none;
    margin: 0px;
    color: #1b1b1b;
    font-size: 14px;
    text-transform: uppercase;
    letter-spacing: 2px;
}

@media(max-width:1190px) {
    #main {
        background-size: 1150px;

    }

    .name {
        left: 10%;
        top: 50%;
        transform: translate(-10%, -50%);
    }

    .about-model img {
        height: 400px;
    }

    #services {
        height: auto;

    }

    .s-b-container {
        flex-wrap: wrap;
    }

    .s-box {
        flex-grow: 1;

    }

    .s-b-text {
        text-align: center;
    }

    #contact-form form {
        width: 95%;
    }
}

@media(max-width:970px) {
    #main {
        background-image: none;
    }

    .name {
        left: 50%;
        top: 50%;
        transform: translate(-50%, -50%);

    }

    .about-model {
        display: none;
    }

    #about {
        justify-content: center;
        padding-top: 0px;
    }

    .about-text {
        width: 90%;
    }

    .about-text h1 {
        font-size: 4rem;
    }

    .p-b-container {
        width: 100%;
    }
}

@media(max-width:900px) {
    .toggle {
        display: block;
    }

    .toggle:before {
        content: '\f0c9';
        font-family: fontAwesome;
        line-height: 0px;
        margin-left: 25px;
    }
}