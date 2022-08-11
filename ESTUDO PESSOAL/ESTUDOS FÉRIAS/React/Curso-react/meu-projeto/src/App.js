import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'

import Home from './pages/Home';

import Empresa from './pages/Empresa';

import Contato from './pages/Contato';

import NavBar from './components/NavBar';

function App() {
  
  return (
  
    <Router>
      <NavBar />
      
      <Routes>
        <Route exact path="/" element={<Home />} />
        <Route exact path="/empresa" element={<Empresa />} />
        <Route exact path="/contato" element={<Contato />} />
      </Routes>
    </Router>
    
  )
}

export default App;
