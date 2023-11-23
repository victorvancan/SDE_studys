export function domInjector(seletor) {
    return function (target, propertykey) {
        let elemento = null;
        const getter = function () {
            if (!elemento) {
                const elemento = document.querySelector(seletor);
                console.log(`Buscando elemento do dom com o seletor
                ${seletor} para injetar em ${propertykey}`);
            }
            return elemento;
        };
        Object.defineProperty(target, propertykey, {
            get: getter
        });
    };
}
