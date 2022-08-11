import { Link } from 'react-router-dom'

function NavBar(){
    return(
            <ul>
                <li>
                    <Link to="/">Home</Link>
                </li>
                <li>
                    <Link to="/empresa">About</Link>

                </li>
                <li>
                    <Link to='/contato'>Contato</Link>
                </li>
            </ul>
    )
}

export default NavBar