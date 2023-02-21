import LoginPage from "./LoginPage";
import MainPage from "./MainPage";
import {BrowserRouter} from "react-router-dom";
import {AppRouter} from "./AppRouter";

function App() {
  return (
    <div className="App">
        <BrowserRouter><AppRouter /></BrowserRouter>
    </div>
  );
}

export default App;
