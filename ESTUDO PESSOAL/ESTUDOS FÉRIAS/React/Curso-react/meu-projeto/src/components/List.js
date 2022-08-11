import Item from "./Item"

function List(){
    return(
        <>
            <h1>Minha lista</h1>
            <ul>
                <Item marca="Ferrari" ano_lancamento={1995}/>
                <Item marca="Fiat" ano_lancamento={1975}/>
                <Item/>
            </ul>
        </>
    );
}

export default List