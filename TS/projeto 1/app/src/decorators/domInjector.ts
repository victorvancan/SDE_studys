export function domInjector(seletor: string) {
    return function (target: any, propertykey: string) {

        let elemento: HTMLElement | null= null;
        
        const getter = function () {
            if (!elemento)
            {
                const elemento = <HTMLElement>document.querySelector(seletor); 
                console.log(`Buscando elemento do dom com o seletor
                ${seletor} para injetar em ${propertykey}`);
            }
            
            return elemento;
        }

        Object.defineProperty(target, propertykey, {

            get: getter

        })
    }
}