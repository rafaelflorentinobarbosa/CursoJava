import { Routes } from '@angular/router';
import { MenuComponent } from './pages/menu/menu.component';
import { CadastrarVeiculoComponent } from './pages/cadastrar-veiculo/cadastrar-veiculo.component';
import { HomeComponent } from './pages/home/home.component';
import { CadastrarDespesaComponent } from './pages/cadastrar-despesa/cadastrar-despesa.component';
import { ListarDespesasComponent } from './pages/listar-despesas/listar-despesas.component';

export const routes: Routes = [
    {
        path: '',
        component: HomeComponent
    },  
    {
        path: 'menu',
        component: MenuComponent
    },    
    {
        path: 'cadastrarVeiculo',
        component: CadastrarVeiculoComponent
    },    
    {
        path: 'cadastrarDespesa',
        component: CadastrarDespesaComponent
    },    
    {
        path: 'listarVeiculos',
        component: ListarDespesasComponent
    },    
    {
        path: 'listarDespesas',
        component: ListarDespesasComponent
    }

];
