function download(url, callback){
    setTimeout(()=>{

        console.log(`Downling ${url}...`);

        callback(url)    

    }, 3000);
}


const url1 = 'https://www.javascripttutorial.net/pic1.jpg'
const url2 = 'https://www.javascripttutorial.net/pic2.jpg'
const url3 = 'https://www.javascripttutorial.net/pic3.jpg'
const url4 = 'https://www.javascripttutorial.net/pic4.jpg'
const url5 = 'https://www.javascripttutorial.net/pic5.jpg'


download(url1, (picture)=>{
    console.log(`Processing ${picture}`);
    download(url2, (picture)=>{
        console.log(`Processing ${picture}`);
        download(url3, (picture)=>{
            console.log(`Processing ${picture}`)
            download(url4,(picture)=>{
                console.log(`Processing ${picture}`);
                download(url5, (picture)=>{
                    console.log(`Processing ${picture}`);
                });
            });
        });
    });
});



